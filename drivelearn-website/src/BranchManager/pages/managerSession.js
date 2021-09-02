import React, {useState} from 'react';
import '../../App.css';
import './../Table.css';
import './../filterButton.css';
import Navbar from '../Navbar';
import Sidebar from '../managerSidebar';


const ManagerVehicle = () => {
    const [sidebarOpen, setSidebarOpen] = useState(false);
  
    const openSidebar = () => {
       setSidebarOpen(true);
    };
  
    const closeSidebar = () => {
      setSidebarOpen(false);
   };
  
   
  return (
    <div className="container">
        <Navbar sidebarOpen={sidebarOpen} openSidebar={openSidebar} />
      <main>
         <div className="main__container">
            <div className="main__title">
                <div className="main__greeting">
                <h1>Manage Session</h1>
                <p> Kalutara Branch</p>
                </div>
            </div>
            <br/><br/>
            <div className="table_responsive">
              <div className="search"> 
               <div className="search_box">
                 <div className="dropdown">
                   <div className="default_option">All</div>  
                   {/* <ul>
                         <li>All</li>
                         <li>Recent</li>
                         <li>Popular</li>
                       </ul> */}
                   </div>
                 <div className="search_field">
                 <input type="text" className="input" placeholder="Search" />
                 <i className="fas fa-search"></i>
                </div>
                </div>
                 <div className="create-button">
                   <div className="create_btn">
                     <a href="./manageraddsession"><i className="fa fa-plus-circle"></i></a>
                     <br/>
                     <p>Add Session</p>
                   </div>
                </div>
               </div>
              
            <br/>
            <table>
              <thead>
                  <tr>
                  <th>Id</th>
                  <th>Instructor Name</th>
                  <th>Date</th>
                  <th>Time</th>
                  <th>No of Student</th>
                  <th>Vehicle No</th>
                  <th>Current On</th>
                  <th>Status</th>
                  <th>Action</th>
                 </tr>
             </thead>

             <tbody>
                <tr>
                     <td>01</td>
                     <td>Sarath Kumara</td>
                     <td>2021.05.06</td>
                     <td>10.00am</td>
                     <td>4</td>
                     <td>hh-2231</td>
                     <td>3</td>
                     <td>Completed</td>

                     <td>
                     <span className="action_btn">
                     <a href="./managerupdatesession" className="eye"><i className="fa fa-eye"></i></a>
                     <a href="#" className="trash"><i className="fa fa-trash"></i></a>
                     </span>
                     </td>
                </tr>
               
             </tbody>
            </table>
            </div> 
        </div>
      </main>
        <Sidebar sidebarOpen={sidebarOpen} closeSidebar={closeSidebar} />
    </div>
  );
  
  }
  
  export default ManagerVehicle;