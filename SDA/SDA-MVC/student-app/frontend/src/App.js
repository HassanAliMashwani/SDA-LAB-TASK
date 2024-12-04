// frontend/src/App.js
import React, { useEffect, useState } from 'react';
import StudentController from './StudentController';
import StudentView from './StudentView';

const App = () => {
    const [students, setStudents] = useState([]);

    // Fetch student data from the backend
    useEffect(() => {
        fetch('http://localhost:5000/students')
            .then(response => response.json())
            .then(data => setStudents(data));
    }, []);

    return (
        <div>
            <h1>Student Information</h1>
            {students.map((student, index) => (
                <StudentController
                    key={index}
                    model={student}
                    view={StudentView}
                />
            ))}
        </div>
    );
};

export default App;
