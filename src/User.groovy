/**
 * Created by ubuntu on 8/6/16.
 */
println"Hello"

List a = [1,2,3,4,5]
List a1 = ["Sagar", "Jain",7,75, true]

if (a) {
    println "a is not empty"
}

String b = ""

if (b) {
    println "b is not empty"t
}
else {
    println "b is empty"
}

Map data = [firstName: "Sagar", lastName: "Jain", info: "learning Groovy"]
println  data
println(data.firstName)
println(data.get("firstName"))
println(data["lastName"])
println a1
println a1.get(4)