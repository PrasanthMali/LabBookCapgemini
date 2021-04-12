import React, { Component } from 'react';
 
import { Link } from 'react-router-dom';
 
class LandingComponent extends Component {
 
    render() {
        return (
            <div>
                <h2>Home</h2>
                <p>
                    <Link to={`/addadmin`}>Add</Link>
                </p>
                <p>
                    <Link to={`/deleteadmin`}>Delete</Link>
                </p>
                <p>
                    <Link to={`/getalladmins`}>Get all</Link>
                </p>
                <p>
                    <Link to={`/updateadmin`}>Update</Link>
                </p>
                <p>
                    <Link to={`/getadmin`}>Get Admin</Link>
                </p>
 
            </div>
        );
 
    }
 
}
 
export default LandingComponent;