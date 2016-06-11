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

Map m1 = [firstName: "Sagar", lastName: "Jain", email: "jain", age: 500]
Map m2 = [firstName: "Shubham", lastName: "Jain", email: "jain", age: 40]
Map m3 = [firstName: "Priyal", lastName: "Singh", email: "jain", age: 300]
Map m4 = [firstName: "Smita", lastName: "P", email: "jain", age: 20]
Map m5 = [firstName: "Akshita", lastName: "Gangarde", email: "jain", age: 100]

User1 u1 = new User1(m1)
User1 u2 = new User1(m2)
User1 u3 = new User1(m3)
User1 u4 = new User1(m4)
User1 u5 = new User1(m5)

List l = [u1,u2,u3,u4,u5]
List m = []
List n = []
l.each { item->
 //   println "${it.firstName} ${it.lastName} (${it.age})"
    println item
    if (item.age >= 100) {
        m.push(item)
    }

    if (item.age < 100) {
        n.push(item)
    }

}
println m
println n

/* List m = l.findAll {
    it.age >100 }
 */