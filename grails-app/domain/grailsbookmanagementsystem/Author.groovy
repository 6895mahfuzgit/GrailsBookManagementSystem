package grailsbookmanagementsystem

class Author {

    String id
    String authorName

    static hasMany = [book:Book]
    static constraints = {
        authorName(blank: false, maxSize: 100)
    }
}
