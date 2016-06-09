/**
 * Created by ubuntu on 8/6/16.
 */
class User {
    String firstName, lastName, email
    int age
}

Map m1 = [firstName: "Sagar", lastName: "Jain", email: "jain", age: "5"]
Map m2 = [firstName: "Shubham", lastName: "Jain", email: "jain", age: "4"]
Map m3 = [firstName: "Priyal", lastName: "Singh", email: "jain", age: "3"]
Map m4 = [firstName: "Smita", lastName: "P", email: "jain", age: "2"]
Map m5 = [firstName: "Akshita", lastName: "Gangarde", email: "jain", age: "1"]

User u1 = new User(m1)
User u2 = new User(m2)
User u3 = new User(m3)
User u4 = new User(m4)
User u5 = new User(m5)

List l = [u1,u2,u3,u4,u5]

l.each {
    print it
}

