Scenario Outline: Test iMacs page
    Given I am logged into toolsQA
    When I select <Link> from the Product Category dropdown
    Then I check I am on <Title>
    And close the browser

    Examples: 
      | Link                       | Title       |
      | .//*[@id='menu-item-34']/a | Accessories |
      | .//*[@id='menu-item-35']/a | iMacs       |
