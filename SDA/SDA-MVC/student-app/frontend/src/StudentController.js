// frontend/src/StudentController.js
import React from 'react';
import StudentView from './StudentView';

const StudentController = ({ model, view }) => {
    const { name, regNo, gpa, grade } = model;

    // Update the view with student data
    return <StudentView name={name} regNo={regNo} gpa={gpa} grade={grade} />;
};

export default StudentController;
