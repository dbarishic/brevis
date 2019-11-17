<script>

</script>

<style>
    header {
        max-width: 100%;
        width: 100vw;
        height: 6vh;
        min-height: 60px;
        display: flex;
        box-shadow: 0 -0.4rem 0.9rem 0.2rem rgba(0,0,0,.5);
        align-items: center;
        justify-content: space-between;
        overflow: hidden;
        background: #e7eff6;
    }

    nav {
        margin-right: 48px;
    }

    nav ul {
        list-style: none;
        text-align: center;
    }
    nav ul li {
        display: inline-block;
    }
    nav ul li a {
        display: block;
        padding: 15px;
        text-decoration: none;
        color: #333;
        font-weight: 800;
        text-transform: uppercase;
        margin: 0 10px;
    }
    nav ul li a,
    nav ul li a:after,
    nav ul li a:before {
        transition: all .5s;
    }
    nav ul li a:hover {
        color: #3271a8;
    }

    .title {
        /*background-size: auto 100%;*/
        /*width: 8.9rem;*/
        /*height: 2.2rem;*/
        margin-left: 48px;
        font-size: 2rem;
    }

    a {
        color: #333333;
        text-decoration: none;
    }

</style>

<header>
    <a class="title">BREVIS</a>
    <nav class="stroke">
        <ul>
            <li><a href="#">Log in</a></li>
            <li><a href="#">Sign Up</a></li>
        </ul>
    </nav>
</header>