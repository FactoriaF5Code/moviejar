<script>
    export let movie;
</script>

<div>
    <img src={movie.posterUrl} alt="poster de la película ${movie.title}">
    <p>{movie.title}</p>
    <p>{movie.director}</p>
</div>

<style>
    div {
        margin: 10px;
    }

    img {
        width: 200px;
    }
    p {
        color: black;
    }
</style>