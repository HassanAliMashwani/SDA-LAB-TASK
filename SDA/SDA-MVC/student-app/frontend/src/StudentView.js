// frontend/src/StudentView.js
import React from 'react';

const StudentView = ({ name, regNo, gpa, grade }) => {
    return (
        <div>
            <h3>{name}</h3>
            <p>Registration Number: {regNo}</p>
            <p>GPA: {gpa}</p>
            <p>Grade: {grade}</p>
        </div>
    );
};

export default StudentView;
