<script>
	import Statistics from "./Statistics.svelte";
			import Navbar from "./Navbar.svelte";
    import TextInput from "./TextInput.svelte";

    export let name;
</script>

<style>
    h1 {
        color: purple;
    }

	:global(body) {
		margin: 0;
		padding: 0;
	}

	:global(html) {
		margin: 0;
		padding: 0;
	}

	.container {
		display: flex;
		justify-content: center;
		flex-direction: column;
		align-items: center;
	}

	body {
		padding: 0;
		margin: 0;
		min-width: 100vh;
		min-height: 100%;
	}

	section#accueil {
		background: #e7eff6;
		position: relative;
		width: 100%;
		height: 94vh;
		overflow: hidden;
	}

	.triangle_vert {
		position: absolute;
		bottom: 0;
		left: 0;
		margin-left: -100px;
		margin-bottom: -200px;

		background: #63ace5;
		width: 120%;
		height: 300px;

		-webkit-animation: triangle_v 20s infinite cubic-bezier(.14,.36,.59,.9);
		-ms-animation: triangle_v 20s infinite cubic-bezier(.14,.36,.59,.9);
		animation: triangle_v 20s infinite cubic-bezier(.14,.36,.59,.9);
	}

	@-webkit-keyframes triangle_v {
		0% {
			-webkit-transform: rotate(5deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			-ms-transform: rotate(5deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			transform: rotate(5deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
		}

		25% {
			-webkit-transform: rotate(7deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			-ms-transform: rotate(7deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			transform: rotate(7deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
		}

		50% {
			-webkit-transform: rotate(4deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			-ms-transform: rotate(4deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			transform: rotate(4deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
		}

		75% {
			-webkit-transform: rotate(2deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			-ms-transform: rotate(2deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			transform: rotate(2deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
		}

		100% {
			-webkit-transform: rotate(5deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			-ms-transform: rotate(5deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			transform: rotate(5deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
		}
	}


	@-ms-keyframes triangle_v {
		0% {
			-webkit-transform: rotate(5deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			-ms-transform: rotate(5deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			transform: rotate(5deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
		}

		25% {
			-webkit-transform: rotate(8deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			-ms-transform: rotate(8deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			transform: rotate(8deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
		}

		50% {
			-webkit-transform: rotate(4deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			-ms-transform: rotate(4deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			transform: rotate(4deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
		}

		75% {
			-webkit-transform: rotate(2deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			-ms-transform: rotate(2deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			transform: rotate(2deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
		}

		100% {
			-webkit-transform: rotate(5deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			-ms-transform: rotate(5deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			transform: rotate(5deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
		}
	}

	@keyframes triangle_v {
		0% {
			-webkit-transform: rotate(5deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			-ms-transform: rotate(5deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			transform: rotate(5deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
		}

		25% {
			-webkit-transform: rotate(8deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			-ms-transform: rotate(8deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			transform: rotate(8deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
		}

		50% {
			-webkit-transform: rotate(4deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			-ms-transform: rotate(4deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			transform: rotate(4deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
		}

		75% {
			-webkit-transform: rotate(2deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			-ms-transform: rotate(2deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			transform: rotate(2deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
		}

		100% {
			-webkit-transform: rotate(5deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			-ms-transform: rotate(5deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			transform: rotate(5deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
		}
	}


	.triangle_rose {
		position: absolute;
		top: 0;
		left: 0;
		margin-left: -100px;
		margin-top: -150px;

		background: #adcbe3;
		width: 120%;
		height: 250px;

		transform: rotate(7deg);
		-webkit-transform: rotate(7deg);
		-ms-transform: rotate(7deg);

		-webkit-animation: triangle_r 20s infinite cubic-bezier(.14,.36,.59,.9);
		-ms-animation: triangle_r 20s infinite cubic-bezier(.14,.36,.59,.9);
		animation: triangle_r 20s infinite cubic-bezier(.14,.36,.59,.9);
	}


	@-webkit-keyframes triangle_r {
		0%   {
			-webkit-transform: rotate(7deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			-ms-transform: rotate(7deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			transform: rotate(7deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
		}

		25% {
			-webkit-transform: rotate(3deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			-ms-transform: rotate(3deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			transform: rotate(3deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
		}

		50% {
			-webkit-transform: rotate(6deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			-ms-transform: rotate(6deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			transform: rotate(6deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
		}

		75% {
			-webkit-transform: rotate(9deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			-ms-transform: rotate(9deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			transform: rotate(9deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
		}

		100% {
			-webkit-transform: rotate(7deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			-ms-transform: rotate(7deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			transform: rotate(7deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
		}
	}

	@-ms-keyframes triangle_r {
		0%   {
			-webkit-transform: rotate(7deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			-ms-transform: rotate(7deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			transform: rotate(7deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
		}

		25% {
			-webkit-transform: rotate(3deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			-ms-transform: rotate(3deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			transform: rotate(3deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
		}

		50% {
			-webkit-transform: rotate(6deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			-ms-transform: rotate(6deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			transform: rotate(6deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
		}

		75% {
			-webkit-transform: rotate(9deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			-ms-transform: rotate(9deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			transform: rotate(9deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
		}

		100% {
			-webkit-transform: rotate(7deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			-ms-transform: rotate(7deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			transform: rotate(7deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
		}
	}

	@keyframes triangle_r {
		0%   {
			-webkit-transform: rotate(7deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			-ms-transform: rotate(7deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
			transform: rotate(7deg) rotateZ(0deg) translate3d(2%,5%,0) rotateZ(0deg);
		}

		25% {
			-webkit-transform: rotate(3deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			-ms-transform: rotate(3deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
			transform: rotate(3deg) rotateZ(90deg) translate3d(2%,5%,0) rotateZ(-90deg);
		}

		50% {
			-webkit-transform: rotate(6deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			-ms-transform: rotate(6deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
			transform: rotate(6deg) rotateZ(180deg) translate3d(2%,5%,0) rotateZ(-180deg);
		}

		75% {
			-webkit-transform: rotate(9deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			-ms-transform: rotate(9deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
			transform: rotate(9deg) rotateZ(270deg) translate3d(2%,5%,0) rotateZ(-270deg);
		}

		100% {
			-webkit-transform: rotate(7deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			-ms-transform: rotate(7deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
			transform: rotate(7deg) rotateZ(360deg) translate3d(2%,5%,0) rotateZ(-360deg);
		}
	}


	section#accueil > header {
		position: absolute;
		z-index: 10;
		top: 50%;
		margin-top: -50px;

		width: 100%;
		height: 100px;
		text-align: center;
	}

	section#accueil header > h1 {
		position: initial;
		font-family: Arial, sans-serif;
		color: #f96457;
		font-size: 18px;
		font-weight: 500;
		letter-spacing: .4em;
		margin-top: 20px;
	}
</style>

<Navbar></Navbar>

<section id="accueil">

	<div class="triangle_rose"></div>
	<div class="triangle_vert"></div>
	<div class="container">
		<TextInput></TextInput>
		<Statistics></Statistics>
	</div>
</section>

