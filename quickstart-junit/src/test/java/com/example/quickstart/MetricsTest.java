package com.example.quickstart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import example.quickstart.service.Metrics;

public class MetricsTest {

	Metrics metrics = new Metrics();
	
	@Test
	public void when_NULLs_RETURNS_zero() throws Exception {
		assertEquals(1, metrics.absSum(null, 1));
		assertEquals(5, metrics.absSum(2, 3));
		
		metrics.absSumModified(null,null);
		metrics.absSumModified(1,1);
		int unCovered = 0;
		for(int i=0; i<metrics.visitedLine.length;i++) {
			if(metrics.visitedLine[i] == 0) {
				unCovered++;
				System.out.println("uncovered line #"+(i));
			}
		}
		
	}
}
