<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="app">
	<input class="form-control" v-model="atodo.id" v-on:keyup.enter="submit" />
	<button class="btn btn-default" v-on:click="submit"  >Guardar</button><br/>
	<br/>
	<div v-for="todo in todos">
		<label>- {{todo.id}}</label>
	</div>

</div>
