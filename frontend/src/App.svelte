<script>
    import Header from "./lib/Header.svelte";
    import Catalog from "./lib/Catalog.svelte";
    import {onMount} from "svelte";

    let movies = []

    onMount(() => {
        fetch("http://localhost:9000/api/movies")
            .then(respuesta => respuesta.json())
            .then(datos => movies = datos)
    })

</script>

<Header/>
<Catalog movies={movies}/>