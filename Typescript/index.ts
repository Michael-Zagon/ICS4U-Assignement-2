/*
 * Assignment 2 returns the length of the largest run in the string
 *
 * @author Michael Zagon
 * @version 1.0
 * @since 2024-04-01
 */

import { createPrompt } from 'bun-promptx'

console.log('This is the max run program.')
console.log('This program will find the length of the largest run in a string')
console.log('STRING EX. xxyyyz, this string has a max run of 3.')

try {
  const userInput = createPrompt("Enter a string: ")
  const inputString = userInput.value

  if (inputString.length === 0) {
    console.log("Invalid input.")
  } else {

    let currentrun = 1
    let maxrun = 1
    // temp being temporary tool
    for (let temp = 0; temp < inputString.length; temp++) {
      if (inputString[temp] === inputString[temp + 1]) {
        currentrun++
        if (currentrun > maxrun) {
          maxrun = currentrun
        }
      } else {
        currentrun = 1
      }
    }

    console.log(`The string "${inputString}" has a max run of ${maxrun}`)
  }
} catch (error) {
  console.error('An error occurred:', error)
}

console.log("\nDone.")

