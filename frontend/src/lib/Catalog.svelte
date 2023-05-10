<script>
    import MovieCard from "./MovieCard.svelte";
    export let movies;
</script>

<div>
    {#each movies as movie}
        <MovieCard movie={movie}/>
    {/each}
</div>

<style>
    div {
        margin: 3%;
        padding: 3%;
        display: flex;
        flex-wrap: wrap;
    }
</style>