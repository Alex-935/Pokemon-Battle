pokemon = ("Water", "Ground")
typeResistance = {"Fire": ["Water", "Ground", "Rock"]}
combatMult = 1

#for Type1, then Type2
for typing in pokemon:
  #search every type in the weaknesses array
    for type in typeResistance:
      #for each weakness in e.g typeRestistance["Fire"]
        for weakness in typeResistance[type]:
          #if the pokemons type is a type that resists fire
            if weakness == pokemon[0]:
              #half damage from  fire moves
                combatMult *= 0.5
## Use multiply here because then you can get the 4x resistance from just multiplying 

print(combatMult)
#Gastrodon is takes 0.25x damage from fire moves
