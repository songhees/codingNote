<%--
  Created by IntelliJ IDEA.
  User: songhee
  Date: 2022/04/14
  Time: 1:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .uploadResult {
            width:100%;
            background-color: gray;
        }

        .uploadResult ul {
            display:flex;
            flex-flow: row;
            justify-content: center;
            align-items: center;
        }

        .uploadResult ul li {
            list-style: none;
            padding:10px;
            align-content: center;
            text-align: center;
        }

        .uploadResult ul li img {
            width: 100px;
        }

        .uploadResult ul li span {
            color:white;
        }
    </style>
</head>
<body>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@include file="../includes/header.jsp"%>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Board Register</h1>
    </div>
    <%-- /.col-lg-12 --%>
</div>
<%-- /.row --%>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Board Register
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <form role="form" action="/board/register" method="post">
                    <div class="form-group">
                        <label>Title</label>
                        <input class="form-control" name="title">
                    </div>
                    <div class="form-group">
                        <label>Text area</label>
                        <input class="form-control" rows="3" name="content">
                    </div>
                    <div class="form-group">
                        <label>Writer</label>
                        <input class="form-control" name="writer">
                    </div>
                    <button type="submit" class="btn btn-default">Submit Button</button>
                    <button type="reset" class="btn btn-default">Reset Button</button>
                </form>
            </div>
            <%-- end panel-body --%>
        </div>
        <%-- end panel-body --%>
    </div>
    <%-- end panel --%>
</div>
<%-- /.row --%>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">File Attach</div>
            <div class="panel-body">
                <div class="form-group uploadDiv">
                    <input type="file" name="uploadFile" multiple>
                </div>
                <div class="uploadResult">
                    <ul>

                    </ul>
                </div>
            </div>
            <%-- end panel-body --%>
        </div>
        <%-- end panel-body --%>
    </div>
    <%-- end panel --%>
</div>
<%-- /.row --%>
<%@include file="../includes/footer.jsp"%>
</body>
</html>
<script>
    $(document).ready(function(e) {

        var formObj = $("form[role='form']");

        var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");
        var maxSize = 5242880; // 5MB

        function checkExtension(fileName, fileSize) {

            if (fileSize >= maxSize) {
                alert("파일 사이즈 초과");
                return false;
            }

            if (regex.test(fileName)) {
                alert("해당 종류의 파일은 업로드할 수 없습니다.");
                return false;
            }
            return true;
        }

        function showUploadResult(uploadResultArr) {
            if (!uploadResultArr || uploadResultArr.length == 0 ) {return;}

            var uploadUL = $(".uploadResult ul");

            var str ="";

            $(uploadResultArr).each(function(i, obj) {
                if (!obj.image) {
                    var fileCallPath = encodeURIComponent(obj.uploadPath + "/" + obj.uuid + "_" + obj.fileName);
                    var fileLink = fileCallPath.replace(new RegExp(/\\/g), "/");
                    str += "<li data-path='" + obj.uploadPath + "' data-uuid='" + obj.uuid + "' data-filename='" + obj.fileName + "' data-type='" + obj.image + "'><div>";
                    str += "<span>" + obj.fileName + "</span>";
                    str += "<button type='button' data-file=\'" + fileCallPath +"\' data-type='file' class='btn btn-warning btn-circle'><i class='fa fa-times'></i></button><br>";
                    str += "<img src='/resources/img/attach.png'>";
                    str += "</li></div>";
                } else {
                    var fileCallPath = encodeURIComponent(obj.uploadPath + "/s_" + obj.uuid + "_" + obj.fileName);

                    str += "<li data-path='" + obj.uploadPath + "' data-uuid='" + obj.uuid + "' data-filename='" + obj.fileName + "' data-type='" + obj.image + "'><div>";
                    str += "<span>" + obj.fileName + "</span>";
                    str += "<button type='button' data-file=\'" + fileCallPath +"\' data-type='image' class='btn btn-warning btn-circle'><i class='fa fa-times'></i></button><br>";
                    str += "<img src='/display?fileName=" + fileCallPath + "'>";
                    str += "</li></div>";
                }
            });

            uploadUL.append(str);
        }

        $(".uploadResult").on("click", "button", function(e) {

            var targetFile = $(this).data('file');
            var type = $(this).data('type');

            var targetLi = $(this).closest("li");

            $.ajax({
                url:"/deleteFile",
                type:"POST",
                data:{fileName:targetFile, type:type},
                dataType:'text',
                success:function(result) {
                    alert(result);
                    targetLi.remove();
                }
            })
        })

        $("button[type='submit']").on("click", function(e) {

            e.preventDefault();
            var str=" ";

            $(".uploadResult ul li").each(function(i, obj) {
                var jobj = $(obj);
                console.log(jobj);

                str += "<input type='hidden' name='attachList[" + i + "].fileName' value='" + jobj.data("filename") + "'>";
                str += "<input type='hidden' name='attachList[" + i + "].uuid' value='" + jobj.data("uuid") + "'>";
                str += "<input type='hidden' name='attachList[" + i + "].uploadPath' value='" + jobj.data("path") + "'>";
                str += "<input type='hidden' name='attachList[" + i + "].fileType' value='" + jobj.data("type") + "'>";
            })
            formObj.append(str).submit();
        })

        $("input[type='file']").change(function() {
            var formData = new FormData();

            var inputFile = $("input[name='uploadFile']");
            var files = inputFile[0].files;


            for (var i=0; i<files.length; i++) {
                if (!checkExtension(files[i].name, files[i].size)) {
                    return false;
                }
                formData.append('uploadFile', files[i]);
            }

            $.ajax({
                url:"/uploadAjaxAction",
                type:"post",
                processData:false,
                contentType:false,
                data:formData,
                dataType:'json',
                success:function(result) {
                    console.log(result);
                    showUploadResult(result);
                }
            })
        })

    })
</script>