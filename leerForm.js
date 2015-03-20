// JavaScript Document
function checaDatos() {
	window.onload
	var telefono = document.getElementsByType("text").value;
	var Servicios = document.getElementByType("checkbox");
	print("hola mundo\nHola")
}
/**/

<!DOCTYPE html>
<html>
<>
	<body>
		<form  action="." method="input">
			<p>
				Nombre: 
			<br/>
				<input type="text" name="celular" autofocus required/>
			</br>
			</p>
		</form>

		<form  method="checkboxes">
		Que servicio requiere?
		<br/>
				<input id="servicios" name="servicio_1" type="checkbox" />Policia
			<br/>
				<input id="servicios" name="servicio_2" type="checkbox"/>Transito
			<br/>
				<input id="servicios" name="servicio_3" type="checkbox" />Ambulancia
			<br/>
				<input id="servicios" name="servicio_4" type="checkbox"/>Bomberos
		</form>

		<form  action="." method="input">
			<p>
			Informacion adicional:
			</br>
			<input id="comentario" name="comment" type="text"/>
			</p>		
		</form>

		<form>
			<div>
  				<input id="boton" type="button" value="Enviar informacion" onclik="checaDatos();" />
			</div>
 		</form>
          
	</body>
</html>
