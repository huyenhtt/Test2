<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
        integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
        crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<%@page pageEncoding="UTF-8" %>
<div class="container">
    <h1>Data Conversion</h1>

    <form method="post" action="/convert">
        <div class="row">
            <div class="col-lg-6">
                <label for="inputData">Input Data:</label>
                <textarea id="inputData" name="inputData" rows="4" cols="50" placeholder="Enter data"></textarea>


                <label for="inputType">Input Type:</label>
                <select id="inputType" name="inputType">
                    <option value="string">String</option>
                    <option value="base64">Base64</option>
                    <option value="hex">Hex</option>
                    <option value="byte[]">Byte Array</option>
                </select>

                <label for="outputType">Output Type:</label>
                <select id="outputType" name="outputType">
                    <option value="string">String</option>
                    <option value="base64">Base64</option>
                    <option value="hex">Hex</option>
                    <option value="byte[]">Byte Array</option>
                </select>
            </div>

            <div class="col-lg-6">
                <label>Output:</label>
                <textarea id="outputData" rows="4" cols="50" readonly>${outputData}</textarea>
            </div>
        </div>
        <div class="text-center">
            <input type="submit" value="Convert">
        </div>
    </form>
</div>

