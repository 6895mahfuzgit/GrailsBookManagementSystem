package grailsbookmanagementsystem

class Book {

    long id
    String bookTitle

    static belongsTo = [author: Author]
    static constraints = {
        bookTitle(blank: false, unique: true)
    }
}
