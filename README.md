# Spring Boot MovieDb Project
A simple Java 8 / Spring Boot (version 2.0.1) / Maven application.

### Details
- The application uses H2 in memory database.
- Default host port: 8080

### Sample usage
Users are enabled to create a database of movies.
<br /> Supported operations:
- getting a list of all movies
- adding a movie
- adding details to existing movie
- getting details of the selected movie

```URL:``` http://localhost:8080/movies

| Method | Path | Decription | Example |
| ------ | ---- | ---------- | ------- |
| GET    | /movies  | get all movies |
| POST | /movies | add a movie | {<br />"title": "Twardowsky"<br />}
| GET    | /movies/{movieId}  | get selected movie |
| POST | /movies/{movieId}/details | add movie getails | {<br />"genre": "FANTASY",<br />"description": "Pan Twardowsky, siedzi sam jak palec w stacji kosmicznej na Księżycu. Czeka, aż po jego duszę przybędzie piekielna egzekutorka cyrografów. Ale od czego polski spryt, woda święcona i dwie tony ładunków wybuchowych?"<br />}
|GET | /movies/{movieId}/details | get details of selected movie| 
