/**
 * Created by ubuntu on 8/6/16.
 */
/**
 * Created by ubuntu on 8/6/16.
 */
class User1 {
    String firstName, lastName, email
    int age

    String toString() {
        "${firstName} ${lastName} (${age})"
    }
}

Map m1 = [firstName: "Sagar", lastName: "Jain", email: "jain", age: 5]
Map m2 = [firstName: "Shubham", lastName: "Jain", email: "jain", age: 4]
Map m3 = [firstName: "Priyal", lastName: "Singh", email: "jain", age: 3]
Map m4 = [firstName: "Smita", lastName: "P", email: "jain", age: 2]
Map m5 = [firstName: "Akshita", lastName: "Gangarde", email: "jain", age: 1]

User1 u1 = new User1(m1)
User1 u2 = new User1(m2)
User1 u3 = new User1(m3)
User1 u4 = new User1(m4)
User1 u5 = new User1(m5)

List l = [u1,u2,u3,u4,u5]

l.each {
 //   println "${it.firstName} ${it.lastName} (${it.age})"
    println it
}

