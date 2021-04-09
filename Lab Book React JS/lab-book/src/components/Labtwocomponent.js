import React from 'react';
 
class EmployeeList extends React.Component {
    constructor() {
        super();
        this.state = {
            id: '',
            name: '',
            salary: '',
            department: '',
            emplist: [],
        }
        this.handleInputChange = this.handleInputChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }
 
    handleInputChange(event) {
        this.setState({
            [event.target.name]: event.target.value
        })
    }
    handleSubmit(event) { 
        let emp = {
            id: this.state.id,
            name: this.state.name,
            salary: this.state.salary,
            department: this.state.department
        };
        this.setState({
            emplist: [...this.state.emplist, emp]
        });           
        event.preventDefault();
    }
 
    render() {    
        return (
            <div>
                <h3>Add Employee</h3>
                <form onSubmit={this.handleSubmit} method="post">
                    <p>
                        <label>ID:<input type="text" name="id" value={this.state.id} onChange={this.handleInputChange} /></label>
                    </p>
                    <p>
                        <label>Name:<input type="text" name="name" value={this.state.name} onChange={this.handleInputChange} /></label>
                    </p>
                    <p>
                        <label>Salary:<input type="text" name="salary" value={this.state.salary} onChange={this.handleInputChange} /></label>
                    </p>
                    <p>
                        <label>Department:<input type="text" name="department" value={this.state.department} onChange={this.handleInputChange} /></label>
                    </p>
                    <p>
                        <input type="submit" value="Submit" />
                    </p>
 
                </form>
                
                <h3>Employee List</h3>
                {
                    this.state.emplist !== undefined && (
                    this.state.emplist.length > 0 && (
                        <table border="3">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Name</th>
                                    <th>Salary</th>
                                    <th>Department</th>
                                    <th>Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                            {this.state.emplist.map((emp, index) =>
                                <tr>
                                     <td>{emp.id}</td>
                                     <td>{emp.name}</td>
                                     <td>{emp.salary}</td>
                                     <td>{emp.department}</td>
                                     <td><button onClick={this.handleInputChange}>Update</button> <button onClick={this.handleInputChange}>Delete</button></td>
                                </tr>
                               
                            )}
                            </tbody>
                        </table>
                    ))
               }       
               <h3>Update Employee</h3>
                <form onSubmit={this.handleSubmit} method="put">
                    <p>
                        <label>ID:<input type="text" name="id" value={this.state.id} onChange={this.handleInputChange} /></label>
                    </p>
                    <p>
                        <label>Name:<input type="text" name="name" value={this.state.name} onChange={this.handleInputChange} /></label>
                    </p>
                    <p>
                        <label>Salary:<input type="text" name="salary" value={this.state.salary} onChange={this.handleInputChange} /></label>
                    </p>
                    <p>
                        <label>Department:<input type="text" name="department" value={this.state.department} onChange={this.handleInputChange} /></label>
                    </p>
                    <p>
                        <input type="submit" value="Update" />
                    </p>
 
                </form>            
            </div>           
        );
    }
}
 
export default EmployeeList;