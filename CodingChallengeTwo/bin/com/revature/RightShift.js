function rightShift (num, power) {
	let answer = num
	let repeatedNum = power
	
	while (repeatedNum > 0){
		answer = Math.floor(answer/2)
		repeatedNum--
	}
	return answer
}

function rightShiftTest(){
	let testValues = [80,-24,-5,4666,3777,-512]
	let testPowers = [3,2,1,6,6,10]
	let expectedAnswers = [10,-6,-3,72,59,-1]
	
	for(let i=0; i<testValues.length; i++){
		let actualAnswers = rightShift(testValues[i], testPowers[i])
		console.log(`Number: ${testValues[i]}\tPower: ${testPowers[i]}\n`
                    +`\tExpected:\t${expectedAnswers[i]}\n\tActual:\t\t${actualAnswers}`)
	}
}

rightShiftTest()