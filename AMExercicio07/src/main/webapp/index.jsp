<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora - com MODEL</title>

<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<!-- BEGIN MAIN -->

    <div class="p-3">
        <div class="container d-flex justify-content-center">
            <div class="col-12 col-md-8 col-lg-4 d-flex justify-content-center shadow shadow-container mt-5 mb-5 p-3 bg-secondary">
                <form class="col-12 col-md-6 col-lg-10 px-2" method="post" action="TerceiroServlet"> <!--  MUITO IMPORTANTE: METHOD E ACTION -->
                    <div class="text-center mb-4">
                        <h3 class="font-title-recuperarsenha">Calculadora</h3>
                    </div>
                    <div class="col-12 col-md-12 col-lg-12 w-100">
                        <label class="label" for="name">Valor 1: </label>
                        <input class="w-100 mb-2" type="text" name="val1"/>
                    </div>
                    <div class="col-12 col-md-12 col-lg-12 w-100">
                        <label class="label" for="name">Valor 2:</label>
                        <input class="w-100 mb-4" type="text" name="val2"/>
                    </div>
                    <div class="col-12 col-md-12 col-xl-12 d-grid gap-2 d-md-flex flex-wrap justify-content-md-center">
  						<button class="col-2 col-md-2 btn btn-dark" type="reset" value="Limpar">C</button>
  						<button class="col-2 col-md-2 btn btn-dark" type="submit" name="btnSomar" value="+">+</button>
  						<button class="col-2 col-md-2 btn btn-dark" type="submit" name="btnSubtrair" value="subtrair">-</button>
  						<button class="col-2 col-md-2 btn btn-dark" type="submit" name="btnMultiplicar" value="multiplicar">*</button>
  						<button class=" col-2 col-md-2 btn btn-dark" type="submit" name="btnDividir" value="dividir">/</button>
					</div>
					<div class="d-grid gap-2 d-md-flex justify-content-md-center mt-4 bg-white">
  						<h4 class="text-center pt-1">Resultado = ${requestScope.resposta} </h4>
					</div>
					
                </form>
            </div>
        </div>
    </div>
    
    <!-- END MAIN -->

</body>
</html>