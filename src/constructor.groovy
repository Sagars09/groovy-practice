/**
 * Created by ubuntu on 8/6/16.
 */
class Person {
    String firstName
    String lastName
    int score

    /*Person(String firstName, String lastName, int Score ) {
        this.firstName = firstName
        this.lastName = lastName
        this.score = score
    }*/
}



println "whereas in groovy it is done as:"

Map m = [firstName: "hello", lastName: "hi", score:5]

Person u = new Person(m)
println u.firstName