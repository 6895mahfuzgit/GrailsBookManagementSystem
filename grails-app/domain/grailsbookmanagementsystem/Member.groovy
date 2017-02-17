package grailsbookmanagementsystem

class Member {

    String id
    String memberName


    static constraints = {

        memberName(blank: false, maxSize: 100)
    }
}
