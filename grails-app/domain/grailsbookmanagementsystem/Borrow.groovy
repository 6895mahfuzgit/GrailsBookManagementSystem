package grailsbookmanagementsystem

class Borrow {

    Date issueDate
    Date dueDate
    Date recievedDate

    static belongsTo = [book: Book]
    static hasOne = [member: Member]

    static constraints = {
        issueDate(nullable: false)
        dueDate(nullable: false)
        recievedDate(nullable: false)
    }
}
