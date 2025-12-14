import tkinter as tk
import mysql.connector
from tkinter import * 
import hashlib
 
#Called at the button submit act willl continueslly loop until a password and username iin the database is called
def submitact():
    
    user = Username.get()
    passw = password.get()
 
    print(f"The name entered by you is {user} {passw}")
 
    logintodb(user, passw)
 

def logintodb(user, passw):
    
    # If password is entered by the 
    # user
    if passw:
        db = mysql.connector.connect(host ="localhost",
                                     user = user,
                                     password = passw,
                                     db ="AnimalShelter",
                                     port=3000)
        cursor = db.cursor()
        
    # If no password is entered by the
    # user
    else:
        db = mysql.connector.connect(host ="localhost",
                                     user = user,
                                     db ="AnimalShelter",
                                     port=3000)
        cursor = db.cursor()
        
    # A Table in the database
    savequery = "select * from AnimalShelter"
    
    try:
        cursor.execute(savequery)
        myresult = cursor.fetchall()
        
        # Printing the result of the
        # query
        for x in myresult:
            print(x)
        print("Query Executed successfully")
        
    except:
        db.rollback()
        print("Error occurred")




 ###This code is used to register new users via getting the information from the login screen   
def register_user():
        user = Username.get()
        passw = password.get()
 
        connection = mysql.connector.connect(host ="localhost", ##Ini the future with this database I woulkd add an actual place to store all uysernames and passwords.
                                     user = user,
                                     password = password,
                                     db ="AnimalShelter",
                                     port=3000)
        if connection:
            cursor = connection.cursor()
            hashed_password = hashlib.sha256(password.encode()).hexdigest() #SHA 256 is the standard incryption prosess these days
            try:
                sql = "INSERT INTO AnimalShelter(username, password) VALUES (%s, %s)"
                cursor.execute(sql, (user, hashed_password))
                connection.commit()
                print("User registered successfully.")
                return True
            except mysql.connector.Error as err:
                print(f"Error registering user: {err}")
                connection.rollback()
                return False
            finally:
                cursor.close()
                connection.close()
        return False
 

root = tk.Tk()
width = root.winfo_screenwidth()
height = root.winfo_screenheight()
root.geometry("{}x3{}".format(width,height))
root.title("DBMS Login Page")
 

# Defining the first row
lblfrstrow = tk.Label(root, text ="Username -", )
lblfrstrow.place(x = 50, y = 20)

Username = tk.Entry(root, width = 35)
Username.place(x = 150, y = 20, width = 100)
 
lblsecrow = tk.Label(root, text ="Password -")
lblsecrow.place(x = 50, y = 50)

password = tk.Entry(root, width = 35)
password.place(x = 150, y = 50, width = 100)

submitbtn = tk.Button(root, text ="Login", 
                      bg ='blue', command = submitact)
submitbtn.place(x = 150, y = 135, width = 55)

regbutton = tk.Button(root, text ="Register", 
                      bg ='blue', command = register_user)
regbutton.place(x = 0, y = 135, width = 55)

root.mainloop()