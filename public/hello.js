$(document).ready(() => {
  $.ajax({
    url: "http://localhost:8080/greeting"
  }).then((data) => {
    $('.greeting-id').append(data.id)
    $('.greeting-content').append(data.content)
  })
})
