
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<%@include file="components/header.jsp" %>

<%@include file="components/body1.jsp" %>

<h1> Registrar usuario </h1>
<div class="container-fluid px-5 py-5">
    <form action="SvUsers" method="POST">
        
        <div class="form-floating mb-3">
            <input class="form-control" id="inputUserName" type="text" name="inputUserName" />
            <label for="inputUserName">Nombre usuario</label>
        </div>
        
        <div class="row mb-3">
            <div class="col-md-6">
                <div class="form-floating mb-3 mb-md-0">
                    <input class="form-control" id="inputPassword" type="password" name="inputPassword" />
                    <label for="inputPassword">Contraseña</label>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-floating mb-3 mb-md-0">
                    <input class="form-control" id="inputPasswordConfirm" type="password" name="inputPasswordConfirm" />
                    <label for="inputPasswordConfirm">Confirmar contraseña</label>
                </div>
            </div>
        </div>
        
        <div class="row mb-3">
            <div class="col-md-6">
                <div class="form-floating mb-3 mb-md-0">
                    <input class="form-control" id="inputRole" type="text" name="inputRole" />
                    <label for="inputRole">Rol</label>
                </div>
            </div>
        </div>
        
        <div class="mt-4 mb-0">
            <div class="d-grid"><button class="btn btn-primary btn-block" type="submit">Crear usuario</button></div>
        </div>
    </form>
</div>

<%@include file="components/body2.jsp" %>