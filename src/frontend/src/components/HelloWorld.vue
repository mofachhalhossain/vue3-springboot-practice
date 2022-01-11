<template>
  <h1>Index</h1>
  <p>Message: {{message}}</p>
</template>

<script>
export default {
  name: 'HelloWorld',
  data() {
    return {
      message: "",
    }
  },
  mounted() {
    fetch("/api/messages/index")
    .then((response) => response.text())
    .then((data) =>{
      this.message = data;
    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
