import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import ComponentName from './App';
import EmployeeComponent from './Employee.component';
import DepartmentComponent from './Department.component';
import IntegrationComponent from './Integration.component';
import * as serviceWorker from './serviceWorker';

ReactDOM.render(<IntegrationComponent />, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();
