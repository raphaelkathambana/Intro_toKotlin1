//Title
var title: String = "Melody"

//Artist
val artist: String = "Singwriter"

//Album
val albumName: String = "Songs to Sing in the Dark"

//Genre
val genreName: String = "Pop"

//Publisher
var nameOfPublisher: String = "Justin Time"

//Track Number
var trackNumber: Int = 3

//Date
val month: String = "March"
val dayOfPublish: Double = 14.2020
dayOfPublish.toString()
val dateOfPublish: String =  month + dayOfPublish
/*
Here the value of the month will be added to the value of the day to give the Actual date of publish
*/

Log.d(tag: "Title", title)  
Log.d(tag: "Artist", artist)
Log.d(tag: "Album", albumName)
Log.d(tag: "Genre", genreName)
Log.d(tag: "Publisher", nameOfPublisher)
Log.d(tag: "Track number", trackNumber)
Log.d(tag: "Date", dateOfPublish)
