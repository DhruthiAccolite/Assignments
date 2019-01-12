import React,{Component} from 'react';
class ListComponent extends Component{
    
    render(){
       
        return(
        <div>
            <h1>Employees</h1>
            <table border="1" cellpading="1"><tbody>
            {
                this.props.employees &&
                this.props.employees.map((employee,i)=>{
                   return( <tr key={employee.name}>
                        <td>
                            {employee.name}
                        </td>
                        <td>
                            {employee.lname}
                        </td>
                        <td>
                            {employee.age}
                        </td>
                        <td>
                            {employee.designation}
                        </td>
                        <td>
                            {employee.location}
                        </td>
                        <td>
                            {employee.department}
                        </td>
                    </tr>
                    )
                })
            }
            </tbody></table>
            
        </div>
        )
    }
}
export default ListComponent;