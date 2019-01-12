import React,{Component} from 'react';
import EmployeeComponent from './Employee.component'
import DepartmentComponent from './Department.component'

class IntegrationComponent extends Component{
    state= {
        employees:[
            {
                name: "raviteja",
                lname: "V",
                age: 21,
                designation: "intern",
                location: "Mangalore, Karnataka,India, Asia, World, Earth",
                department:"it"
              },
              {
                name: "Devraj",
                lname: "M",
                age: 21,
                designation: "intern",
                location: "Bangalore,Karnataka,India, Asia, World, Earth",
                department:"it"
              },
              {
                name: "kumar",
                lname: "santanu",
                age: 26,
                designation: "intern",
                location: "Patna, Bihar,India, Asia, World, Earth",
                department:"hr"
              }
        ],
        departments:[
            {
                name: "it",
                description:"lcaol"
              },
              {
                name: "hr",
                description:"dasd"
              }
        ]
    };
    onEmployeeAdded = (newEmployeeData)=>{
        console.log("new Data",newEmployeeData)
        let employees=[...this.state.employees];
        
        let newData = {...newEmployeeData};
        employees.push(newData)
        console.log(this.state.employees)
        this.setState({employees:employees})
    }
    onDepartmentAdded = (newDepartmentData)=>{
        console.log("new Data",newDepartmentData)
        let departments=[...this.state.departments];
        let newData = {...newDepartmentData};
        departments.push(newData)
        this.setState({departments:departments})
    }
    render(){
        return(
            <React.Fragment>
                <EmployeeComponent departments={this.state.departments} onEmpAdd={this.onEmployeeAdded} employees={this.state.employees}>
                </EmployeeComponent>
                <DepartmentComponent departments={this.state.departments} onDeptAdd={this.onDepartmentAdded} employees={this.state.employees}>
                </DepartmentComponent>
            </React.Fragment>
        );
    }
}
export default IntegrationComponent