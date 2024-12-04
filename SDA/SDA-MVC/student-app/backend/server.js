// backend/server.js
const express = require('express');
const app = express();
const port = 5001;

// Dummy data for students
const students = [
    { name: 'Hassan', regNo: '12345', gpa: 3.6, grade: 'A' },
    { name: 'Ali', regNo: '12346', gpa: 3.8, grade: 'A' },
    { name: 'Mashwani', regNo: '12347', gpa: 2.5, grade: 'C' },
    { name: 'Aalyan', regNo: '12348', gpa: 2.8, grade: 'B' },
    { name: 'Ghazi', regNo: '12349', gpa: 1.9, grade: 'F' },
];

// Endpoint to get student data
app.get('/students', (req, res) => {
    res.json(students);
});

app.listen(port, () => {
    console.log(`Backend running at http://localhost:${port}`);
});
