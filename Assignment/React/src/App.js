import React, { useState } from "react";
import logo from "./logo.svg";
import "./App.css";
import * as XLSX from "xlsx";

function App() {
  const [items, setItems] = useState([]);

  const readExcel = (file) => {
    const promise = new Promise((resolve, reject) => {
      const fileReader = new FileReader();
      fileReader.readAsArrayBuffer(file);

      fileReader.onload = (e) => {
        const bufferArray = e.target.result;

        const wb = XLSX.read(bufferArray, { type: "buffer" });

        const wsname = wb.SheetNames[0];

        const ws = wb.Sheets[wsname];

        const data = XLSX.utils.sheet_to_json(ws);

        resolve(data);
      };

      fileReader.onerror = (error) => {
        reject(error);
      };
    });

    promise.then((d) => {
      setItems(d);
    });
  };

  return (
    <div>
      <input
        type="file"
        onChange={(e) => {
          const file = e.target.files[0];
          readExcel(file);
        }}
      />

      <table class="table container">
        <thead>
          <tr>
            <th scope="col">EmployeeId</th>
            <th scope="col">EmpNumber</th>
            <th scope="col">EmployeeName</th>
            <th scope="col">DOB</th>
            <th scope="col">DeptId</th>
            <th scope="col">Salary</th>
            <th scope="col">DeptId</th>
            <th scope="col">DeptName</th>
            <th scope="col">NoOfEmployee</th>
          </tr>
        </thead>
        <tbody>
          {items.map((d) => (
            <tr key={d.EmployeeId}>
              <th>{d.EmployeeId}</th>
              <td>{d.EmpNumber}</td>
              <td>{d.EmployeeName}</td>
              <td>{d.DOB}</td>
              <td>{d.DeptId}</td>
              <td>{d.Salary}</td>
              <td>{d.DeptId}</td>
              <td>{d.DeptName}</td>
              <td>{d.NoOfEmployee}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;