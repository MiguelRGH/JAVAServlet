
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<%@include file="components/header.jsp" %>

<%@include file="components/body1.jsp" %>

<h1> Registrar profesional médico </h1>
<div class="container-fluid px-5 py-5">
    <form>
        <div class="row mb-3">
            <div class="col-md-6">
                <div class="form-floating mb-3 mb-md-0">
                    <input class="form-control" id="inputFirstName" type="text" placeholder="Digite los nombres" />
                    <label for="inputFirstName">Nombres</label>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-floating">
                    <input class="form-control" id="inputLastName" type="text" placeholder="Digite los apellidos" />
                    <label for="inputLastName">Apellidos</label>
                </div>
            </div>
        </div>
        <div class="form-floating mb-3">
            <input class="form-control" id="inputEmail" type="email" placeholder="ejemplo@correo.com" />
            <label for="inputEmail">Correo electrónico</label>
        </div>
        
        <div class="row mb-3">
            <div class="col-md-6">
                <div class="form-floating mb-3 mb-md-0">
                    <input class="form-control" id="inputAddres" type="text" placeholder="Dirección" />
                    <label for="inputAddres">Dirección</label>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-floating mb-3 mb-md-0">
                    <input class="form-control" id="inputPhone" type="text" placeholder="Teléfono" />
                    <label for="inputPhone">Teléfono</label>
                </div>
            </div>
        </div>
        
        <div class="row mb-3">
            <div class="col-md-6">
                <div class="form-floating mb-3 mb-md-0">
                    <input class="form-control" id="inputBornDate" type="text" placeholder="DD/MM/AAAA" />
                    <label for="inputBornDate">Fecha de nacimiento</label>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-floating mb-3 mb-md-0">
                    <input class="form-control" id="inputSpeciality" type="text" placeholder="Especialidad" />
                    <label for="inputSpeciality">Especialidad</label>
                </div>
            </div>
        </div>
        
        <div class="row mb-3">
            <div class="col-md-6">
                <div class="form-floating mb-3 mb-md-0">
                    <input class="form-control" id="inputPassword" type="password" placeholder="Cree una contraseña" />
                    <label for="inputPassword">Contraseña</label>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-floating mb-3 mb-md-0">
                    <input class="form-control" id="inputPasswordConfirm" type="password" placeholder="Confirmar contraseña" />
                    <label for="inputPasswordConfirm">Confirmar contraseña</label>
                </div>
            </div>
        </div>
        <div class="mt-4 mb-0">
            <div class="d-grid"><a class="btn btn-primary btn-block" href="login.html">Create Account</a></div>
        </div>
    </form>
</div>

<%@include file="components/body2.jsp" %>