package grailsbookmanagementsystem

class Book {

    long id
    String bookTitle

    static belongsTo = [author: Author]
    static hasMany = [borrow: Borrow]
    static constraints = {
        bookTitle(blank: false, unique: true)
    }


    String toString() {
        return this.bookTitle
    }
}
