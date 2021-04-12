import React from 'react';
import Axios from 'axios';

class EmployeeDeleteForm extends React.Component {
    constructor() {
        super();
        this.state = {
            id: ''

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
        event.preventDefault();

        Axios.delete(`http://localhost:8090/admins/deleteadmin/${this.state.id}`)
            .then(res => {
                console.log(res.admin);
            })
            alert('Admin is deleted with the id : ' +this.state.id)
    }



    render() {

        return (
            <div>
                <form onSubmit={this.handleSubmit} method="post">
                    <label>id:<input type="text" name="id" value={this.state.id} onChange={this.handleInputChange} /></label><br/><br/>

                    <input type="submit" value="Submit" />
                </form>
            </div>
        );
    }
}
export default EmployeeDeleteForm