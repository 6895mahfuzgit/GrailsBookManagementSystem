package grailsbookmanagementsystem

class Member {

    String id
    String memberName


    static hasMany = [borrow: Borrow]
    static constraints = {

        memberName(blank: false, maxSize: 100)
    }
}
