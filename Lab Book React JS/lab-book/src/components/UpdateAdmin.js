import React from 'react';
import Axios from 'axios';

class UpdateAdmin extends React.Component {
    constructor() {
        super();
        this.state = {
            id: '',
            name: '',
            password: ''

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
        const admin = {
            adminId: this.state.id,
            adminName: this.state.name,
            adminPassword: this.state.password

        }

        Axios.put(`http://localhost:8090/admins/updateadmin/${this.state.id}`,admin)
            .then(res => {
                console.log(res.admin);
            })
            alert('Admin with the id : ' +this.state.id+" "+'is updated.')
    }



    render() {

        return (
            <div>
                <form onSubmit={this.handleSubmit} method="post">
                    <label>id:<input type="text" name="id" value={this.state.id} onChange={this.handleInputChange} /></label><br/><br/>
                    <label>name:<input type="text" name="name" value={this.state.name} onChange={this.handleInputChange} /></label><br/><br/>
                    <label>password:<input type="password" name="password" value={this.state.password} onChange={this.handleInputChange} /></label><br/><br/>

                    <input type="submit" value="Submit" />
                </form>
            </div>
        );
    }
}
export default UpdateAdmin;