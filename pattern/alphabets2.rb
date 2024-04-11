num = gets.chomp("enter ther number").to_i
for i in 0...num
  for j in i.downto(0)
    print (num - (j + 1))
  end
  puts
end
# end
puts "hello\n"
puts " "
# num = gets.chomp("enter ther number").to_i
for i in 0...num
  for j in 1..num-i-1
    print(" ")
  end
  for k in 1..i+1
    # k=1
    print(k)
    # k=k+1
  end
  puts 
end

for i in 0...num
  for j in 1..num-i
    print(num-i)
  end
  for k in 1..i+1
    print(" ")
  end
  puts
end
puts
puts "next questions"
for i in 0...num
  for j in 1..num-i-1
    print("."+" ")
  end
  for k in (i+1)..((2*i)+1)
    print(k.to_s + " ")
  end
  for m in (2*i).downto(i+1)
    print(m.to_s + " ")
  end
  for j in 1..num-i-1
    print(" ")
  end
  puts
end


(0...num).each do |i|
  (1..num - i - 1).each { print ". " }
  (i + 1..2 * i + 1).each { |k| print k.to_s + " " }
  (2 * i).downto(i + 1) { |m| print m.to_s + " " }
  (1..num - i).each { print "  " }
  puts
end