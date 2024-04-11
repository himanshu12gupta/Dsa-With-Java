num = gets.chomp("enter ther number").to_i
for i in 0...num
  for j in 1..num-i
    if(i%2==0)
      print("*"+" ")
    else
      print("#"+" ")
    end
  
  end
  puts 
end