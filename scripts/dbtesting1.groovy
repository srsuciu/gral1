import ca.ralsoft.gral1.*
//new FilmsDescription(film_title: "First title", film_description: 'First description')
def allfilms = FilmsDescription.list()
println allfilms[0].film_description