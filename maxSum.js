var longestSublist = maxSum(1, 3, 5, null, 0, 1, -2, null, 12, 8, 10, null, 4, 2, -35);
console.log("first " + longestSublist);
longestSublist = maxSum(1, 3, 5);
console.log("second " + longestSublist);


function maxSum(){

	if(arguments.length == 0){
		return 0;
	}else {
		return maxSumHelper(arguments);
	}
}

function maxSumHelper(){

	var sum, lsum, stp, ep, lstp, lep;
	var abc = arguments[0]
	var lSublist=[];

	//l -> largest, stp => starting point, edp => ending point
	sum = lsum = stp = ep = lstp = lep = 0;

		//traverse through initial list of lists
		for (i=0; i < abc.length + 1; i++ ){

			//When you reach an end of a sublist
			//set endpoint of list and compare with current
			//largest values and replace if neccessary
			if((i === abc.length) ||  (abc[i] === null) ){
				
				ep = i;
				if (sum > lsum){
					lsum = sum;
					lstp = stp;
					lep = ep;
				}
				//reset sum count and set starting
				//point of next list
				sum = 0;
				stp = ep +1;
			}else{
				sum += abc[i];
			}
		}

		//with lstp and lsp available, create your sublist
		for (i=0 , j = lstp; i < (lep - lstp) ; i++, j++) {
			lSublist[i] = abc[j];
		}

	return lSublist; 
}
