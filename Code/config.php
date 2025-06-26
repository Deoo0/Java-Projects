<?php
    error_reporting(1);
    $con = mysqli_connect('localhost', 'root','','inventory');

        if (isset($_POST['saveBtn'])){
            $pname = $_POST['prod_name']; 
            $pprice = $_POST['prod_price']; 
                if ($pname == "" || $pname == ""){
                    header("location: index.php?notif = invalid input");
                }else{
                    if ($pprice == "" || $pprice == ""){
                        header("location: index.php?notif = invalid input");
                    }else{
                        mysqli_query($con, "INSERT INTO product (name,price) VALUES ('$pname', '$pprice')");
                        header("location: index.php?notif = added successfull");
                    }
        }}

?>