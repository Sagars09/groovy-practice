/**
 * Created by ubuntu on 9/6/16.
 */
List a =[1,26,3,44,53,36,17]
List b = []
int i=0;
a.each { item->
    if (item>20) {
        println item
        b.push(item)
    }
}
 b.each {
     println it
 }