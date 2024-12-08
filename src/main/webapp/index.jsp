<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Course-management-app</title>
    <style>
      * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
      }
      body {
        font-family: Arial, Helvetica, sans-serif;
        background-image: url("https://img.freepik.com/free-vector/student-graduation-cap-using-computer-desk_1262-21421.jpg");
        background-size: 100%;
        background-repeat: no-repeat;
        background-position: center;
        width: 100%;
        height: 100vh;
      }
      nav{
        display: flex;
        justify-content: space-between;
        padding: 2vh 8vh;
        background-color: #3498db;
        backdrop-filter: blur(10px);
      }
      nav h1{
        color: white;
      }
      ul{
        display: flex;
        gap: 10px;
      }
      ul li{
        list-style-type: none
      }
      ul li a{
        color: white;
        text-decoration: none;
        padding: 10px;
        font-size: 18px;
      }
      ul li a:hover{
        color: blueviolet;
        text-decoration: underline;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <nav>
        <h1>Course management App</h1>
        <ul>
          <li><a href="addCourse.html">Add Course</a></li>
          <li><a href="editCourse.html">Edit Course</a></li>
          <li><a href="deleteCourse.html">Delete Course</a></li>
          <li><a href="allCourse.html">All Courses</a></li>
        </ul>
      </nav>
    </div>
  </body>
</html>
