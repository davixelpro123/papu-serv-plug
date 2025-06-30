__config().autostart := true

# Cambia este número a la cantidad de bots que quieras
bots_to_spawn := 10

i := 0
while(i < bots_to_spawn,
  run("player bot" + i + " spawn in survival"),
  i := i + 1
)
